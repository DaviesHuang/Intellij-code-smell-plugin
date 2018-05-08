package Visitors;

import com.intellij.psi.*;
import com.intellij.refactoring.extractMethod.ExtractMethodHandler;
import com.intellij.refactoring.extractMethod.ExtractMethodProcessor;
import org.jetbrains.annotations.NotNull;

public class PsiElementExtractVisitor extends JavaRecursiveElementWalkingVisitor {

    private void extract(PsiElement element) {
        ExtractMethodProcessor processor = ExtractMethodHandler.getProcessor(
                element.getProject(),
                new PsiElement[]{element},
                element.getContainingFile(),
                false
        );
        assert processor != null;
        ExtractMethodHandler.invokeOnElements(element.getProject(), processor, element.getContainingFile(), false);
    }

    private void extractElementArray(PsiElement[] elements) {
        PsiElement element = elements[0];
        ExtractMethodProcessor processor = ExtractMethodHandler.getProcessor(
                element.getProject(),
                elements,
                element.getContainingFile(),
                false
        );
        assert processor != null;
        ExtractMethodHandler.invokeOnElements(element.getProject(), processor, element.getContainingFile(), false);
    }

    @Override
    public void visitIfStatement(@NotNull PsiIfStatement statement) {
        System.out.println("visited if statement");
        extract(statement);
    }

    @Override
    public void visitWhileStatement(PsiWhileStatement statement) {
        System.out.println("visited while statement");
        extract(statement);
    }

    @Override
    public void visitDoWhileStatement(PsiDoWhileStatement statement) {
        System.out.println("visited dowhile statement");
        extract(statement);
    }

    @Override
    public void visitForStatement(PsiForStatement statement) {
        System.out.println("visited for statement");
        extract(statement);
    }

    @Override
    public void visitForeachStatement(PsiForeachStatement statement) {
        System.out.println("visited foreach statement");
        extract(statement);
    }

    @Override
    public void visitSwitchStatement(PsiSwitchStatement statement) {
        System.out.println("visited switch statement");
        extract(statement);
    }

    @Override
    public void visitMethodCallExpression(PsiMethodCallExpression expression) {
        System.out.println("visited method call statement");
        extract(expression);
    }

    @Override
    public void visitConditionalExpression(PsiConditionalExpression expression) {
        System.out.println("visited conditional statement");
        extract(expression);
    }

    @Override
    public void visitStatement(PsiStatement statement) {
        System.out.println("visited statement");
        extract(statement);
    }

    @Override
    public void visitCodeBlock(PsiCodeBlock block) {
        System.out.println("visited code block");
        extractElementArray(block.getStatements());
    }

}