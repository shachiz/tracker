
import components.set.Map;
import components.set.Map1L;
import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;
import components.naturalnumber.NaturalNumber;
import components.naturalnumber.NaturalNumberSecondary;

/**

 *
 * @author Shachi Mahajan
 *
 */
public class SalesTracker extends Map1L {

    /*
     * Private members --------------------------------------------------------
     */

    /**
     * Representation of {@code this}.
     */
    private Map<String, int> rep;

    /**
     * Creator of initial representation.
     */
    private void createNewRep() {

        this.rep = new Map1L<String, int>

    }

    /*
     * Constructors -----------------------------------------------------------
     */

    /**
     * No-argument constructor.
     */
    public SalesTracker() {

        this.createNewRep();

    }

    /*
     * Standard methods -------------------------------------------------------
     */


    @Override
    public final void clear() {
        this.createNewRep();
    }

    /*
     * Kernel methods ---------------------------------------------------------
     */

     // adds sales
    @Override
    public final void addSales(String key, int added) {
        int v = this.rep.value(key);
        if(this.rep.hasKey(key)) {
            this.rep.replaceValue(key, added+v);
        }
    }

    //
    @Override
    public final void newItem(String key) {
        this.rep.add(key, 0);

    }

    @Override
    public final int deleteItem(String key) {
        int v = this.rep.value(key);
        this.rep.remove(key);
        return v

    }
}

public static void main(String[] args) {

    String item1 = "pizza pin";
    int sales = 76;
    addSales(item1, sales);

    String item2 = "sandwhich pin";
    newItem(item2);

    String item3 = "pasta pin";
    int oldSales = deleteItem(item3);





}