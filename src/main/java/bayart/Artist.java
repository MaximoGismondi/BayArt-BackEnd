package bayart;
import java.util.ArrayList;

public class Artist{

    private Integer idUser;
	private ArrayList<Integer> imageList;
    private Boolean notificationsNewSub;
    private Boolean notificationsSell;
    private Boolean notificationsSponsor;

    public Artist(Integer idUser, ArrayList<Integer> imageList, Boolean notificationsNewSub, Boolean notificationsSell, Boolean notificationsSponsor) {
        this.idUser = idUser;
        this.imageList = imageList;
        this.notificationsNewSub = notificationsNewSub;
        this.notificationsSell = notificationsSell;
        this.notificationsSponsor = notificationsSponsor;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public ArrayList<Integer> getImageList() {
        return imageList;
    }

    public void setImageList(ArrayList<Integer> imageList) {
        this.imageList = imageList;
    }

    public Boolean getNotificationsNewSub() {
        return notificationsNewSub;
    }

    public void setNotificationsNewSub(Boolean notificationsNewSub) {
        this.notificationsNewSub = notificationsNewSub;
    }

    public Boolean getNotificationsSell() {
        return notificationsSell;
    }

    public void setNotificationsSell(Boolean notificationsSell) {
        this.notificationsSell = notificationsSell;
    }

    public Boolean getNotificationsSponsor() {
        return notificationsSponsor;
    }

    public void setNotificationsSponsor(Boolean notificationsSponsor) {
        this.notificationsSponsor = notificationsSponsor;
    }
}

