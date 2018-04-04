package me.zengjin.eiprocessor;

import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;

import java.io.IOException;

import javax.annotation.processing.Filer;
import javax.lang.model.element.Modifier;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.util.SimpleAnnotationValueVisitor7;



public class EntryVisitor extends SimpleAnnotationValueVisitor7<Void, Void> {
    private Filer mFiler;
    private String mPackageName;

    EntryVisitor(Filer filer) {
        this.mFiler = filer;
    }




    @Override
    public Void visitString(String s, Void p) {
        mPackageName = s;
        return p;
    }

    @Override
    public Void visitType(TypeMirror t, Void p) {
     generateJavaCode(t);
        return p;
    }

    public void generateJavaCode(TypeMirror typeMirror) {
        final TypeSpec targetActivity =
                TypeSpec.classBuilder("WXEntryActivity")
                        .addModifiers(Modifier.PUBLIC)
                        .addModifiers(Modifier.FINAL)
                        .superclass(TypeName.get(typeMirror))
                        .build();

        final JavaFile javaFile = JavaFile.builder(mPackageName + ".wxapi", targetActivity)
                .addFileComment("wechat entry")
                .build();
        try {
            javaFile.writeTo(mFiler);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}