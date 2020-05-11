/*
 * The MIT License
 * Copyright © 2014-2019 Ilkka Seppälä
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package org.tyaa.designpatterns.creational.prototype;

import java.io.IOException;

/**
 * ElfBeast.
 */
public class ElfBeast extends Beast {

  private static ElfBeast elfBeastSample = new ElfBeast();
  private String helpType;

  public ElfBeast() {  }

  public ElfBeast(String helpType) {
    this.helpType = helpType;
  }

  public ElfBeast(ElfBeast elfBeast) {
    super(elfBeast);
    this.helpType = elfBeast.helpType;
  }

  @Override
  public ElfBeast copy() throws IOException, ClassNotFoundException {
    // return new ElfBeast(this);
    return ((ElfBeast)elfBeastSample.deepCopy()).setHelpType(helpType);
  }

  public ElfBeast setHelpType(String helpType) {
    this.helpType = helpType;
    return this;
  }

  @Override
  public String toString() {
    return "Elven eagle helps in " + helpType;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!super.equals(obj)) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    var other = (ElfBeast) obj;
    if (helpType == null) {
      return other.helpType == null;
    }
    return helpType.equals(other.helpType);
  }

}
