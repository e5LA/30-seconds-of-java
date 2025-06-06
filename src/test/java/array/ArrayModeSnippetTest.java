/*
 * MIT License
 *
 * Copyright (c) 2017-2022 Ilkka Seppälä
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * Tests for 30 Seconds of Java code library.
 */
class ArrayModeSnippetTest {
  /**
   * Test for {@link ArrayModeSnippet #ArrayModeSnippet(int[])}.
   */
  @Test
  void testModeArray() {
    assertEquals(List.of(2), ArrayModeSnippet.modeArray(new int[]{1, 2, 2, 3}));
    assertEquals(List.of(2, 3), ArrayModeSnippet.modeArray(new int[]{1, 2, 2, 3, 3}));
    assertEquals(List.of(1, 2, 3, 4), ArrayModeSnippet.modeArray(new int[]{1, 2, 3, 4}));
    assertEquals(List.of(), ArrayModeSnippet.modeArray(new int[]{}));
    assertEquals(List.of(-1, -2), ArrayModeSnippet.modeArray(new int[]{-1, -1, -2, -2, -3}));
  }
}