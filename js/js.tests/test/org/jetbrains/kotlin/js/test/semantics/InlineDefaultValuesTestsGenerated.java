/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.js.test.semantics;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/codegen/boxInline/defaultValues")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class InlineDefaultValuesTestsGenerated extends AbstractInlineDefaultValuesTests {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest0(this::doTest, TargetBackend.JS, testDataFilePath);
    }

    @TestMetadata("33Parameters.kt")
    public void test33Parameters() throws Exception {
        runTest("compiler/testData/codegen/boxInline/defaultValues/33Parameters.kt");
    }

    @TestMetadata("33ParametersInConstructor.kt")
    public void test33ParametersInConstructor() throws Exception {
        runTest("compiler/testData/codegen/boxInline/defaultValues/33ParametersInConstructor.kt");
    }

    public void testAllFilesPresentInDefaultValues() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/boxInline/defaultValues"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.JS, true);
    }

    @TestMetadata("defaultInExtension.kt")
    public void testDefaultInExtension() throws Exception {
        runTest("compiler/testData/codegen/boxInline/defaultValues/defaultInExtension.kt");
    }

    @TestMetadata("defaultMethod.kt")
    public void testDefaultMethod() throws Exception {
        runTest("compiler/testData/codegen/boxInline/defaultValues/defaultMethod.kt");
    }

    @TestMetadata("defaultMethodInClass.kt")
    public void testDefaultMethodInClass() throws Exception {
        runTest("compiler/testData/codegen/boxInline/defaultValues/defaultMethodInClass.kt");
    }

    @TestMetadata("defaultParamRemapping.kt")
    public void testDefaultParamRemapping() throws Exception {
        runTest("compiler/testData/codegen/boxInline/defaultValues/defaultParamRemapping.kt");
    }

    @TestMetadata("inlineInDefaultParameter.kt")
    public void testInlineInDefaultParameter() throws Exception {
        runTest("compiler/testData/codegen/boxInline/defaultValues/inlineInDefaultParameter.kt");
    }

    @TestMetadata("inlineLambdaInNoInlineDefault.kt")
    public void testInlineLambdaInNoInlineDefault() throws Exception {
        runTest("compiler/testData/codegen/boxInline/defaultValues/inlineLambdaInNoInlineDefault.kt");
    }

    @TestMetadata("kt11479.kt")
    public void testKt11479() throws Exception {
        runTest("compiler/testData/codegen/boxInline/defaultValues/kt11479.kt");
    }

    @TestMetadata("kt11479InlinedDefaultParameter.kt")
    public void testKt11479InlinedDefaultParameter() throws Exception {
        runTest("compiler/testData/codegen/boxInline/defaultValues/kt11479InlinedDefaultParameter.kt");
    }

    @TestMetadata("kt14564.kt")
    public void testKt14564() throws Exception {
        runTest("compiler/testData/codegen/boxInline/defaultValues/kt14564.kt");
    }

    @TestMetadata("kt14564_2.kt")
    public void testKt14564_2() throws Exception {
        runTest("compiler/testData/codegen/boxInline/defaultValues/kt14564_2.kt");
    }

    @TestMetadata("kt16496.kt")
    public void testKt16496() throws Exception {
        runTest("compiler/testData/codegen/boxInline/defaultValues/kt16496.kt");
    }

    @TestMetadata("kt18689.kt")
    public void testKt18689() throws Exception {
        runTest("compiler/testData/codegen/boxInline/defaultValues/kt18689.kt");
    }

    @TestMetadata("kt18689_2.kt")
    public void testKt18689_2() throws Exception {
        runTest("compiler/testData/codegen/boxInline/defaultValues/kt18689_2.kt");
    }

    @TestMetadata("kt18689_3.kt")
    public void testKt18689_3() throws Exception {
        runTest("compiler/testData/codegen/boxInline/defaultValues/kt18689_3.kt");
    }

    @TestMetadata("kt18689_4.kt")
    public void testKt18689_4() throws Exception {
        runTest("compiler/testData/codegen/boxInline/defaultValues/kt18689_4.kt");
    }

    @TestMetadata("kt5685.kt")
    public void testKt5685() throws Exception {
        runTest("compiler/testData/codegen/boxInline/defaultValues/kt5685.kt");
    }

    @TestMetadata("simpleDefaultMethod.kt")
    public void testSimpleDefaultMethod() throws Exception {
        runTest("compiler/testData/codegen/boxInline/defaultValues/simpleDefaultMethod.kt");
    }

    @TestMetadata("varArgNoInline.kt")
    public void testVarArgNoInline() throws Exception {
        runTest("compiler/testData/codegen/boxInline/defaultValues/varArgNoInline.kt");
    }

    @TestMetadata("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class LambdaInlining extends AbstractInlineDefaultValuesTests {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest0(this::doTest, TargetBackend.JS, testDataFilePath);
        }

        public void testAllFilesPresentInLambdaInlining() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.JS, true);
        }

        @TestMetadata("checkLambdaClassIsPresent.kt")
        public void testCheckLambdaClassIsPresent() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/checkLambdaClassIsPresent.kt");
        }

        @TestMetadata("checkLambdaClassesArePresent.kt")
        public void testCheckLambdaClassesArePresent() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/checkLambdaClassesArePresent.kt");
        }

        @TestMetadata("checkObjectClassIsPresent.kt")
        public void testCheckObjectClassIsPresent() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/checkObjectClassIsPresent.kt");
        }

        @TestMetadata("checkStaticLambdaClassIsPresent.kt")
        public void testCheckStaticLambdaClassIsPresent() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/checkStaticLambdaClassIsPresent.kt");
        }

        @TestMetadata("checkStaticLambdaClassesArePresent.kt")
        public void testCheckStaticLambdaClassesArePresent() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/checkStaticLambdaClassesArePresent.kt");
        }

        @TestMetadata("checkStaticObjectClassIsPresent.kt")
        public void testCheckStaticObjectClassIsPresent() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/checkStaticObjectClassIsPresent.kt");
        }

        @TestMetadata("defaultCallInDefaultLambda.kt")
        public void testDefaultCallInDefaultLambda() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/defaultCallInDefaultLambda.kt");
        }

        @TestMetadata("defaultLambdaInNoInline.kt")
        public void testDefaultLambdaInNoInline() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/defaultLambdaInNoInline.kt");
        }

        @TestMetadata("differentInvokeSignature.kt")
        public void testDifferentInvokeSignature() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/differentInvokeSignature.kt");
        }

        @TestMetadata("genericLambda.kt")
        public void testGenericLambda() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/genericLambda.kt");
        }

        @TestMetadata("instanceCapturedInClass.kt")
        public void testInstanceCapturedInClass() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/instanceCapturedInClass.kt");
        }

        @TestMetadata("instanceCapturedInInterface.kt")
        public void testInstanceCapturedInInterface() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/instanceCapturedInInterface.kt");
        }

        @TestMetadata("kt21827.kt")
        public void testKt21827() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/kt21827.kt");
        }

        @TestMetadata("kt21946.kt")
        public void testKt21946() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/kt21946.kt");
        }

        @TestMetadata("kt24477.kt")
        public void testKt24477() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/kt24477.kt");
        }

        @TestMetadata("kt25106.kt")
        public void testKt25106() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/kt25106.kt");
        }

        @TestMetadata("noInline.kt")
        public void testNoInline() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/noInline.kt");
        }

        @TestMetadata("nonDefaultInlineInNoInline.kt")
        public void testNonDefaultInlineInNoInline() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/nonDefaultInlineInNoInline.kt");
        }

        @TestMetadata("receiverClash.kt")
        public void testReceiverClash() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/receiverClash.kt");
        }

        @TestMetadata("receiverClash2.kt")
        public void testReceiverClash2() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/receiverClash2.kt");
        }

        @TestMetadata("receiverClashInClass.kt")
        public void testReceiverClashInClass() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/receiverClashInClass.kt");
        }

        @TestMetadata("receiverClashInClass2.kt")
        public void testReceiverClashInClass2() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/receiverClashInClass2.kt");
        }

        @TestMetadata("simple.kt")
        public void testSimple() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/simple.kt");
        }

        @TestMetadata("simpleErased.kt")
        public void testSimpleErased() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/simpleErased.kt");
        }

        @TestMetadata("simpleErasedStaticInstance.kt")
        public void testSimpleErasedStaticInstance() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/simpleErasedStaticInstance.kt");
        }

        @TestMetadata("simpleExtension.kt")
        public void testSimpleExtension() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/simpleExtension.kt");
        }

        @TestMetadata("simpleGeneric.kt")
        public void testSimpleGeneric() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/simpleGeneric.kt");
        }

        @TestMetadata("simpleStaticInstance.kt")
        public void testSimpleStaticInstance() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/simpleStaticInstance.kt");
        }

        @TestMetadata("thisClash.kt")
        public void testThisClash() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/thisClash.kt");
        }

        @TestMetadata("thisClashInClass.kt")
        public void testThisClashInClass() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/thisClashInClass.kt");
        }

        @TestMetadata("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class CallableReferences extends AbstractInlineDefaultValuesTests {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest0(this::doTest, TargetBackend.JS, testDataFilePath);
            }

            public void testAllFilesPresentInCallableReferences() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.JS, true);
            }

            @TestMetadata("boundFunctionReference.kt")
            public void testBoundFunctionReference() throws Exception {
                runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/boundFunctionReference.kt");
            }

            @TestMetadata("boundFunctionReferenceOnInt.kt")
            public void testBoundFunctionReferenceOnInt() throws Exception {
                runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/boundFunctionReferenceOnInt.kt");
            }

            @TestMetadata("boundFunctionReferenceOnLong.kt")
            public void testBoundFunctionReferenceOnLong() throws Exception {
                runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/boundFunctionReferenceOnLong.kt");
            }

            @TestMetadata("boundPropertyReference.kt")
            public void testBoundPropertyReference() throws Exception {
                runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/boundPropertyReference.kt");
            }

            @TestMetadata("boundPropertyReferenceOnInt.kt")
            public void testBoundPropertyReferenceOnInt() throws Exception {
                runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/boundPropertyReferenceOnInt.kt");
            }

            @TestMetadata("boundPropertyReferenceOnLong.kt")
            public void testBoundPropertyReferenceOnLong() throws Exception {
                runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/boundPropertyReferenceOnLong.kt");
            }

            @TestMetadata("constuctorReference.kt")
            public void testConstuctorReference() throws Exception {
                runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/constuctorReference.kt");
            }

            @TestMetadata("differentInvokeSignature.kt")
            public void testDifferentInvokeSignature() throws Exception {
                runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/differentInvokeSignature.kt");
            }

            @TestMetadata("differentInvokeSignature2.kt")
            public void testDifferentInvokeSignature2() throws Exception {
                runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/differentInvokeSignature2.kt");
            }

            @TestMetadata("functionImportedFromObject.kt")
            public void testFunctionImportedFromObject() throws Exception {
                runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/functionImportedFromObject.kt");
            }

            @TestMetadata("functionReference.kt")
            public void testFunctionReference() throws Exception {
                runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/functionReference.kt");
            }

            @TestMetadata("functionReferenceFromClass.kt")
            public void testFunctionReferenceFromClass() throws Exception {
                runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/functionReferenceFromClass.kt");
            }

            @TestMetadata("functionReferenceFromObject.kt")
            public void testFunctionReferenceFromObject() throws Exception {
                runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/functionReferenceFromObject.kt");
            }

            @TestMetadata("innerClassConstuctorReference.kt")
            public void testInnerClassConstuctorReference() throws Exception {
                runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/innerClassConstuctorReference.kt");
            }

            @TestMetadata("privateFunctionReference.kt")
            public void testPrivateFunctionReference() throws Exception {
                runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/privateFunctionReference.kt");
            }

            @TestMetadata("privatePropertyReference.kt")
            public void testPrivatePropertyReference() throws Exception {
                runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/privatePropertyReference.kt");
            }

            @TestMetadata("propertyImportedFromObject.kt")
            public void testPropertyImportedFromObject() throws Exception {
                runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/propertyImportedFromObject.kt");
            }

            @TestMetadata("propertyReference.kt")
            public void testPropertyReference() throws Exception {
                runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/propertyReference.kt");
            }

            @TestMetadata("propertyReferenceFromClass.kt")
            public void testPropertyReferenceFromClass() throws Exception {
                runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/propertyReferenceFromClass.kt");
            }

            @TestMetadata("propertyReferenceFromObject.kt")
            public void testPropertyReferenceFromObject() throws Exception {
                runTest("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/propertyReferenceFromObject.kt");
            }
        }
    }

    @TestMetadata("compiler/testData/codegen/boxInline/defaultValues/maskElimination")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class MaskElimination extends AbstractInlineDefaultValuesTests {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest0(this::doTest, TargetBackend.JS, testDataFilePath);
        }

        @TestMetadata("32Parameters.kt")
        public void test32Parameters() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/maskElimination/32Parameters.kt");
        }

        @TestMetadata("33Parameters.kt")
        public void test33Parameters() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/maskElimination/33Parameters.kt");
        }

        public void testAllFilesPresentInMaskElimination() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/boxInline/defaultValues/maskElimination"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.JS, true);
        }

        @TestMetadata("kt18792.kt")
        public void testKt18792() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/maskElimination/kt18792.kt");
        }

        @TestMetadata("kt19679.kt")
        public void testKt19679() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/maskElimination/kt19679.kt");
        }

        @TestMetadata("kt19679_2.kt")
        public void testKt19679_2() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/maskElimination/kt19679_2.kt");
        }

        @TestMetadata("kt19679_3.kt")
        public void testKt19679_3() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/maskElimination/kt19679_3.kt");
        }

        @TestMetadata("simple.kt")
        public void testSimple() throws Exception {
            runTest("compiler/testData/codegen/boxInline/defaultValues/maskElimination/simple.kt");
        }
    }
}
