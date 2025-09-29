package StaticClass.Static17;

class Hotel {
    static class Room {
        private int roomNo;
        private String type;

        Room(int roomNo, String type) {
            this.roomNo = roomNo;
            this.type = type;
        }

        void display() {
            System.out.println("Room No: " + roomNo + ", Type: " + type);
        }
    }
}
