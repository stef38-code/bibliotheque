package org.hussard.pattern.fluent;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import org.assertj.core.api.SoftAssertions;
import org.hussard.pattern.fluent.annotations.Model;

@AnalyzeClasses(packages = "org.hussard.pattern.fluent",importOptions = {ImportOption.DoNotIncludeTests.class})
class ModelsShouldBeAnnotatedWithModelTest {
//https://bard.google.com/chat/8f4c49932e5c41f6
    @ArchTest
    void models_should_be_annotated_with_model(JavaClasses clazzs) {
        SoftAssertions softly = new SoftAssertions();

        clazzs.stream()
                .filter(classes -> ! classes.isAnnotatedWith(Model.class))
                .filter(classes -> ! classes.getSimpleName().endsWith("Builder"))
                .filter(classes -> ! classes.getSimpleName().endsWith("Exception"))
                .filter(classes -> ! classes.isInterface())
                .forEach(c -> softly.fail("La classe " + c.getName() + " n'est pas annotée avec l'annotation Model."));
        softly.assertAll();
    }
}
