package JavaRushLessons14;

public class Singletone2_0 {

        static Singletone2_0 INSTANCE = null;
        private Singletone2_0() {

        }

        static Singletone2_0 getInstance() {
            if (INSTANCE==null) {
                INSTANCE = new Singletone2_0();
            }
            return INSTANCE;
        }

    }


