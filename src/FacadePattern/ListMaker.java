
package FacadePattern;


public class ListMaker {

    private List hemsire;
    private List hademe;

    public ListMaker() {
        hemsire = new HemsireList();
        hademe = new HademeList();
    }

    public void ListHemsire() {
        hemsire.nobetListesi();
    }

    public void ListHademe() {
        hademe.nobetListesi();
    }

}
