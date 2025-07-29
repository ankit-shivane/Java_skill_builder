package skillbuilder.java8.set1;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Practice {
    public static void main(String[] args) {
        int[] nums={0,0,0,0};
//        System.out.println(Math.abs(nums[0]));
        System.out.println(approach1(nums));
    }
    public static List<List<Integer>> approach1(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int k=i+2;
            for (int j = i+1; j < nums.length ; j++) {
                if(i!=j && i!= k && j!=k && k<nums.length){
                    if(nums[i]+nums[j]+nums[k]==0){
                        result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    }
                }
                k++;
            }
        }
        return result;
    }


}
