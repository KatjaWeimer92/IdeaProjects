public class ServiceMedia {

    private RepositoryMedia repositoryMedia;

    public ServiceMedia(RepositoryMedia repositoryMedia) {
        this.repositoryMedia = repositoryMedia;
    }

    public void addNewPrintMedia(){
        UtilInput ui = new UtilInput();
        int newPrintMediaId = ui.inputInt("Введите ID: ");
        String newPrintMediaTitle = ui.inputText("Введите название: ");
        int newPrintMediaYear = ui.inputInt("Введите год издания: ");
        String newPrintMediaAuthor = ui.inputText("Введите автора: ");
        int newPrintMediaNumberPages = ui.inputInt("Введите количество страниц: ");




        repositoryMedia.add(new);

    }

}
