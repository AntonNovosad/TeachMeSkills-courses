package homeworks.Lesson14.cities.config;

public enum NumberOfPlayer {

    ONE {
        public String getValue() {
            return "1";
        }
    },
    TWO {
        public String getValue() {
            return "2";
        }
    };

    public abstract String getValue();
}

