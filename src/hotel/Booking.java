package hotel;

public class Booking {
    String startDate, endDate, guestName, status;
    int roomNumber;

    public Booking(String sd, String ed, String gName, int rNum) {
        startDate = sd; endDate = ed; guestName = gName; roomNumber = rNum; status = "Нове";
    }

    public void confirm() { status = "Підтверджено"; }
    public void cancel() { status = "Скасовано"; }

    @Override
    public String toString() {
        return guestName + " - Кімната " + roomNumber + ", " + startDate + " до " + endDate + ", Статус: " + status;
    }
}
