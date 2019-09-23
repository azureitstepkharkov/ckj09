package OOP.pak1;

public class DumpTruckCar extends CargoCar implements Cargo {
    private int angleRaiseBody;
    private boolean BoardBack;

    public DumpTruckCar() {
        this.angleRaiseBody = 30;
        this.BoardBack = true;
        System.out.println("Инициирован самосвал");
    }

    public DumpTruckCar(boolean driverInCar, boolean carStarted, int carrying, int bodyVolume, int angleRaiseBody, boolean BoardBack) {
        super(driverInCar, carStarted, carrying, bodyVolume);
        this.angleRaiseBody = angleRaiseBody;
        this.BoardBack = BoardBack;
        System.out.println("Инициирован самосвал");
    }

    public int getAngleRaiseBody() {
        return angleRaiseBody;
    }

    public void setAngleRaiseBody(int angleRaiseBody) {
        this.angleRaiseBody = angleRaiseBody;
    }

    public boolean isBoardBack() {
        return BoardBack;
    }

    public void setBoardBack(boolean boardBack) {
        BoardBack = boardBack;
    }

    public void raiseBody() {
        for (int i = 0; i < angleRaiseBody; i++) {
            if (i == angleRaiseBody) System.out.format("Кузов поднят\n");
        }
    }

    public void lowerBody() {
        for (int i = angleRaiseBody; i < 0; i--) {
            if (i == 0) System.out.format("Кузов опущен\n");
        }
    }

    @Override
    public void load() {
        System.out.println("Засыпаем груз в самосвал");

    }
}
