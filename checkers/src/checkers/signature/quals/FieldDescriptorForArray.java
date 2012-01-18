package checkers.signature.quals;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

import checkers.quals.ImplicitFor;
import checkers.quals.SubtypeOf;
import checkers.quals.TypeQualifier;

/**
 * Represents a {@link FieldDescriptor field descriptor} (JVM type format)
 * as defined in the <a
 * href="http://java.sun.com/docs/books/jvms/second_edition/html/ClassFile.doc.html#14152">Java
 * Virtual Machine Specification, section 4.3.2</a>, but only for an array type.
 * <p>
 * Not to be used by the programmer, only used internally.
 */
@TypeQualifier
@SubtypeOf({ClassGetName.class, FieldDescriptor.class})
@ImplicitFor(stringPatterns="^\\[+([BCDFIJSZ]|L[A-Za-z_][A-Za-z_0-9]*(/[A-Za-z_][A-Za-z_0-9]*)*(\\$[A-Za-z_][A-Za-z_0-9]*)?;)$")
// A @Target meta-annotation with an empty argument would prevent programmers
// from writing this in a program, but it might sometimes be useful.
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
public @interface FieldDescriptorForArray {}
