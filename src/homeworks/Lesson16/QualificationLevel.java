package homeworks.Lesson16;

public enum QualificationLevel {
    INTERN {
        public String getValue() {
            return "Интерн ";
        }
    },
    ORDINARYDOCTOR {
        public String getValue() {
            return "Обычный врач ";
        }
    },
    DEPARTMENTHEAD {
        public String getValue() {
            return "Заведующий отделением ";
        }
    };

    public abstract String getValue();
}
