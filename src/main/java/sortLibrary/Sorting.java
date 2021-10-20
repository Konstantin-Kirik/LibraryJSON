package sortLibrary;

import writer.WriterAuthor;
import java.util.Comparator;

public interface Sorting {
    class nameAuthor implements Comparator<WriterAuthor> {
        @Override
        public int compare(WriterAuthor tmp1, WriterAuthor tmp2) {
            return tmp1.getName().compareTo(tmp2.getName());
        }
    }

}
