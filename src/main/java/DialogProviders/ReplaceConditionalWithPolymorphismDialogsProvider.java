package DialogProviders;

import Dialogs.ReplaceConditionalWithPolymorphism.*;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.psi.PsiClass;
import com.intellij.psi.PsiElement;

public class ReplaceConditionalWithPolymorphismDialogsProvider {

    public static boolean showStartDialog(Project project) {
        StartRefactoringDialog dialog = new StartRefactoringDialog(project, true);
        dialog.show();
        return dialog.getExitCode() == DialogWrapper.OK_EXIT_CODE;
    }

    public static boolean showExtractSwitchStatementDialog(PsiClass psiClass, PsiElement element) {
        ExtractSwitchStatementDialog dialog = new ExtractSwitchStatementDialog(psiClass, element, true);
        dialog.show();
        return dialog.getExitCode() == DialogWrapper.OK_EXIT_CODE;
    }

    public static boolean showEnsureExtractedMethodVisibilityDialog(PsiClass psiClass, PsiElement element) {
        EnsureExtractedMethodVisibilityDialog dialog = new EnsureExtractedMethodVisibilityDialog(psiClass, element, true);
        dialog.show();
        return dialog.getExitCode() == DialogWrapper.OK_EXIT_CODE;
    }

    public static boolean showCreateSubClassDialog(PsiClass psiClass, PsiElement element) {
        CreateSubClassDialog dialog = new CreateSubClassDialog(psiClass, element, true);
        dialog.show();
        return dialog.getExitCode() == DialogWrapper.OK_EXIT_CODE;
    }

    public static boolean showCreateFactoryMethodDialog(PsiClass psiClass, PsiElement element) {
        CreateFactoryMethodDialog dialog = new CreateFactoryMethodDialog(psiClass, element, true);
        dialog.show();
        return dialog.getExitCode() == DialogWrapper.OK_EXIT_CODE;
    }
}