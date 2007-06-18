/* ====================================================================
   Licensed to the Apache Software Foundation (ASF) under one or more
   contributor license agreements.  See the NOTICE file distributed with
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to You under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with
   the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
==================================================================== */
package org.apache.poi.hdgf.streams;

import org.apache.poi.hdgf.pointers.Pointer;

import junit.framework.TestCase;

public abstract class StreamTest extends TestCase {
	public static class TestPointer extends Pointer {
		private boolean compressed;
		protected boolean hasPointers = false;
		public TestPointer(boolean compressed, int offset, int length, int type, short format) {
			this.compressed = compressed;
			this.offset = offset;
			this.length = length;
			this.type = type;
			this.format = format;
		}

		public boolean destinationCompressed() { return compressed; }
		public boolean destinationHasChunks() { return false; }
		public boolean destinationHasPointers() { return hasPointers; }
		public boolean destinationHasStrings() { return false; }
		public int getSizeInBytes() { return -1; }
	}
}
