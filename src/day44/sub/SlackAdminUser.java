package day44.sub;

import day44.SlackUser;

public class SlackAdminUser extends SlackUser {


    int adminID;

    public SlackAdminUser(String name, String status, int adminID) {
        this.adminID = adminID;
        this.name = name;
        this.status = status;
    }

    public static void main(String[] args) {

        SlackAdminUser admin = new SlackAdminUser("Chanel", "Nothing is impossible!", 777);
        admin.msgInChanel();
        admin.addChanel();
        admin.deleteMsg();
        admin.callSomeone();
        admin.addEmoji();


    }

    public void msgInChanel() {
        System.out.println(name + " just sent new message in #task channel");
    }

    public void deleteMsg() {
        System.out.println(name + " deleted your message");
    }

    public void addChanel() {
        System.out.println(name + " added new #notes channel");

    }

    public String toString() {
        return "SlackAdminUser{" +
                "adminID=" + adminID +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }


//    public String toString() {
//        return String.format("%s %s %s", name, status, adminID);
//
//                  THIS VERSION ALSO WORKING!!!
//
//    }


}
