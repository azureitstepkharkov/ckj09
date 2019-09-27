package OOP.pak1;

interface Listener {
    public void doEvent();
}

public abstract class Accumulator {
    private static SectionAccumulator section[];
    byte[] voltageSection;
    byte[] amperageSection;
    private Listener listener;

    public Accumulator(byte[] voltageSection, byte[] amperageSection) {
        this.voltageSection = voltageSection;
        this.amperageSection = amperageSection;

        section = new SectionAccumulator[voltageSection.length];
        for (int i = 0; i < voltageSection.length; i++) {
            section[i] = new SectionAccumulator();
        }
    }

    abstract void charge();

    void addListener(Listener listener) {
        this.listener = listener;
    }

    static class Li_Ion extends Accumulator {


        public Li_Ion(byte[] voltageSection, byte[] amperageSection) {
            super(voltageSection, amperageSection);
        }


        @Override
        void charge() {
            for (int i = 0; i < section.length; i++) {
                System.out.format("Происходит зарядка Li_Ion аккумулятора, секции № %d, мощность заряда %d\n", i + 1, section[i].power(i));
            }
        }
    }

    static class NiCad extends Accumulator {


        public NiCad(byte[] voltageSection, byte[] amperageSection) {
            super(voltageSection, amperageSection);
        }

        @Override
        void charge() {
            for (int i = 0; i < section.length; i++) {
                System.out.format("Происходит зарядка NiCad аккумулятора, секции № %d, мощность заряда %d\n", i + 1, section[i].power(i));
            }
        }
    }

    private class SectionAccumulator {

        protected int power(int index) {
            class Timer {
                void chargingTime() {
                    if (voltageSection[index] < 6) System.out.println("Ожидаем пока аккумулятор не зарядится.");
                    voltageSection[index] = 6;
                }
            }
            new Timer().chargingTime();
            if (listener != null && voltageSection[index] > 5) listener.doEvent();
            return voltageSection[index] * amperageSection[index];
        }
    }

}


