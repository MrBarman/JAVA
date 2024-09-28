		/*-----UNDERSTANDING Static AND Nonstatic VARIABLES AND METHODS-----*/

        class TestStaticNonStatic {
            int i = 10;
            static int j = 20;

            void m1() {
                System.out.println("Inside TestStaticNonStatic class Non-Static method: " + j++ + " " + i++);
                m2(); //static method accessible inside nonstatic method
            }

            static void m2() {
                System.out.println("Inside TestStaticNonStatic class Static method: " + j);
                //i++; /*Static and NonStatic variables are not accessible inside static methods. If we remove comment lines then it will give CompileTimeError*/
                //m1();
            }
        }

        class StaticAndNonstatic {
            void m2() {
                System.out.println("Inside mainclass Non-Static method: ");
                m3();
            }

            static void m3() {
                System.out.println("Inside mainclass Static method: ");
                //i++;
                //m1();
            }

            public static void main(String... args) {
                TestStaticNonStatic t1 = new TestStaticNonStatic();
                t1.i = 12;
                TestStaticNonStatic.j = 21;
                t1.m1();
                t1.m2();
                TestStaticNonStatic t2 = new TestStaticNonStatic();
                System.out.println("t2 object i value: " + t2.i);
                //TestStaticNonStatic.m1(); //To call NonStatic method, we have to create Object otherwise it will give CompileTimeError
                TestStaticNonStatic.m2();
                t2.m2();
                StaticAndNonstatic stn = new StaticAndNonstatic();
                stn.m2();
                TestStaticNonStatic.m2();
                m3();

            }
        }
