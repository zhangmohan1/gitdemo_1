package muyuan;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class zz {
    public static void main(String[] args) {
        List<String> strings= Arrays.asList("abc","def","cfs","fds");

        //1.返回符合条件的stream
        Stream<String> stringStream=strings.stream().filter(s->"abc".equals(s));

        //2.计算流符合条件的流数量
        long count=stringStream.count();
        System.out.println(count);
    }

}
