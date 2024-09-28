
		/*-----LET'S GET FAMILIAR WITH CONCEPT OF Abstract Class AND Abstract Method-----*/

        abstract class Train { // abstract class
            abstract void drive(); //abstract method

            void reference() {
                System.out.println("Method Inside ABSTRACT CLASS accessed using REFERENCE");
            }

            void inherit() {
                System.out.println("Method Inside ABSTRACT CLASS accessed by INHERITING the class ");
            }
        }

        class RajdhaniExpress extends Train {
            @Override
            void drive() // Overriden method of Abstract class Train
            {
                System.out.println("Driving RajdhaniExpress");
            }
        }

        class VandeBharat extends Train {
            @Override
            void drive() //Overriden again
            {
                System.out.println("Driving VandeBharat");
            }
        }

        class Driver {
            void drive(Train c) {
                c.drive();
            }
        }

        public class Abstract {
            public static void main(String... args) {
                Train c = new RajdhaniExpress(); //We cannot create instance of ABSTRACT CLASS, But we can create reference of ABSTRACT CLASS
                c.reference();
                Driver d = new Driver();
                RajdhaniExpress a = new RajdhaniExpress();
                a.inherit();
                d.drive(new RajdhaniExpress());
                d.drive(new VandeBharat());

            }
        }
