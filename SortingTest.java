import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Created by Gavin on 3/31/16.
 */
@RunWith(Arquillian.class)
public class SortingTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(InsertionSort.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @Test
    public void testInsertionSort() throws Exception {
        Integer[] expected = new Integer[10];
        for(int j = 0; j < 10; j++) {
            expected[j] = j;
        }

        Integer[] actual = new Integer[10];
        actual[0] = 4;
        actual[1] = 5;
        actual[2] = 1;
        actual[3] = 9;
        actual[4] = 0;
        actual[5] = 7;
        actual[6] = 6;
        actual[7] = 2;
        actual[8] = 3;
        actual[9] = 8;
        InsertionSort<Integer> is = new InsertionSort<>();
        is.sort(actual);
        Assert.assertArrayEquals(expected, actual);

    }

    @Test
    public void testSelectionSort() throws Exception {
        Integer[] expected = new Integer[10];
        for(int j = 0; j < 10; j++) {
            expected[j] = j;
        }

        Integer[] actual = new Integer[10];
        actual[0] = 4;
        actual[1] = 5;
        actual[2] = 1;
        actual[3] = 9;
        actual[4] = 0;
        actual[5] = 7;
        actual[6] = 6;
        actual[7] = 2;
        actual[8] = 3;
        actual[9] = 8;
        SelectionSort<Integer> ss = new SelectionSort<>();
        ss.sort(actual);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testBubbleSort() throws Exception {
        Integer[] expected = new Integer[10];
        for(int j = 0; j < 10; j++) {
            expected[j] = j;
        }

        Integer[] actual = new Integer[10];
        actual[0] = 4;
        actual[1] = 5;
        actual[2] = 1;
        actual[3] = 9;
        actual[4] = 0;
        actual[5] = 7;
        actual[6] = 6;
        actual[7] = 2;
        actual[8] = 3;
        actual[9] = 8;
        BubbleSort<Integer> bs = new BubbleSort<>();
        bs.sort(actual);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testGenerics() throws Exception {
        String[] expected = new String[10];
        expected[0] = "aft";
        expected[1] = "after";
        expected[2] = "b";
        expected[3] = "cat";
        expected[4] = "gum";
        expected[5] = "gut";
        expected[6] = "mark";
        expected[7] = "present";
        expected[8] = "the";
        expected[9] = "z";

        String[] actual = new String[10];
        actual[0] = "b";
        actual[1] = "cat";
        actual[2] = "gum";
        actual[3] = "gut";
        actual[4] = "present";
        actual[5] = "z";
        actual[6] = "mark";
        actual[7] = "after";
        actual[8] = "aft";
        actual[9] = "the";

        BubbleSort<String> bs = new BubbleSort<>();
        bs.sort(actual);
        Assert.assertArrayEquals(expected, actual);
    }
}
