/**
 * Copyright 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.gag.instrument.collector;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;

public abstract class BaseMethodCollector implements MethodVisitor {

  @Override
  public void visitAttribute(Attribute attr) {
  }

  @Override
  public AnnotationVisitor visitAnnotationDefault() {
    throw new UnsupportedOperationException();
  }

  @Override
  public void visitCode() {
  }

  @Override
  public void visitLocalVariable(String name, String desc, String sig, Label start, Label end,
      int index) {
  }

  @Override
  public void visitEnd() {
  }

  @Override public void visitFieldInsn(int opcode, String owner, String name, String desc) {}
  @Override public void visitIincInsn(int var, int increment) {}
  @Override public void visitInsn(int opcode) {}
  @Override public void visitIntInsn(int opcode, int operand) {}
  @Override public void visitJumpInsn(int opcode, Label label) {}
  @Override public void visitLabel(Label label) {}
  @Override public void visitLdcInsn(Object cst) {}
  @Override public void visitLineNumber(int line, Label start) {}
  @Override public void visitLookupSwitchInsn(Label dflt, int[] keys, Label[] labels) {}
  @Override public void visitMaxs(int maxStack, int maxLocals) {}
  @Override public void visitMethodInsn(int opcode, String owner, String name, String desc) {}
  @Override public void visitMultiANewArrayInsn(String desc, int dims) {}
  @Override public void visitTableSwitchInsn(int min, int max, Label dflt, Label[] labels) {}
  @Override public void visitTryCatchBlock(Label start, Label end, Label handler, String type) {}
  @Override public void visitTypeInsn(int opcode, String desc) {}
  @Override public void visitVarInsn(int opcode, int operand) {}
  
  @Override
  public void visitFrame(int type, int nLocal, Object[] local, int nStack, Object[] stack) {}
}
