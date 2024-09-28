		/*-----UNDERSTANDING HOW Inheritance WORKS-----*/

        class Parent {
			Parent() {
                System.out.println("Parent constructor");
            }

            private int i = 2;
            protected int j = 5;
            public int k = 7;

            private void m1() {
                System.out.println("Parent private method, value is: " + i);
            }

            protected void m2() {
                System.out.println("Parent protected method, value is: " + j);
            }

            public void m3() {
                System.out.println("Parent public method,value is: " + k);
            }

        }
        /*-----Inheriting class A-----*/

        class Child extends Parent {
			Child() {
                this(10); //calling 1-arg constructor
                System.out.println("Child constructor");
            }

			Child(int i) {
                System.out.println("Child argumented constructor: " + i);
            }

            public void m4() {
                //System.out.println(i); //will give CompileTimeError since superclass varible is of type Private(cannot be inherited).
                System.out.println(j);
                System.out.println(k);
                //m1(); //will give CompileTimeError since superclass method is of type Private(cannot be inherited).
                m2();
                m3();
            }
        }

        class Inheritance {
            public static void main(String... args) {
				Child child = new Child();
				child.m4();
				child.m3();
            }
        }
