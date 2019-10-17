package online_reader_system;

public class Display {

    private Book activeBook;
    private User activeUser;
    private int pageNumber = 0;

    public void displayUser(User user) {
        activeUser = user;
        refreshUsername();
    }

    public void displayBook(Book book) {
        pageNumber = 0;
        activeBook = book;

        refreshTitle();
        refreshDetails();
        refreshPage();
    }

    /** @post updates username display **/
    public void refreshUserName() {}

    /** @post updates title display **/
    public void refreshTitle() {}

    /** @post updates details display **/
    public void refreshDetails() {}

    /** @post updated page display **/
    public void refreshPage() {}

    public void turnPageForward() {
        pageNumber++;
        refreshPage();
    }

    public void turnPageBackward() {
        pageNumber--;
        refreshPage();
    }
}
