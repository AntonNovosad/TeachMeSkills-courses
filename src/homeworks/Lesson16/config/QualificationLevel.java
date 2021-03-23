package homeworks.Lesson16.config;

public enum QualificationLevel {
    INTERN {
        public String getValue() {
            return "Интерн";
        }
    },
    ORDINARY_DOCTOR {
        public String getValue() {
            return "Врач";
        }
    },
    DEPARTMENT_HEAD_DOCTOR {
        public String getValue() {
            return "Заведующий отделением";
        }
    };

    public abstract String getValue();
}
