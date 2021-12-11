package by.bsuir.task.entity;

import java.util.Objects;

public class Room implements Entity {

    private Integer id;
    private String roomNumber;
    private Boolean isOccupied;

    public Room(Integer id, String roomNumber, Boolean isOccupied) {
        this.id = id;
        this.roomNumber = roomNumber;
        this.isOccupied = isOccupied;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Boolean getIsOccupied() {
        return isOccupied;
    }

    public void setIsOccupied(Boolean isOccupied) {
        this.isOccupied = isOccupied;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return id.equals(room.id) && roomNumber.equals(room.roomNumber) && isOccupied.equals(room.isOccupied);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, roomNumber, isOccupied);
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", roomNumber='" + roomNumber + '\'' +
                ", occupied=" + isOccupied +
                '}';
    }
}
