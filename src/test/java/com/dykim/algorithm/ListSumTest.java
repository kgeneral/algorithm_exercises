package com.dykim.algorithm;

import com.google.common.collect.ImmutableList;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ListSumTest {

    @Test
    public void template() {

        ListSum listSum = new ListSum();

        List<Integer> list = ImmutableList.<Integer>builder().add(3).add(1).add(7).add(6).build();
        listSum.setList(list);

        assertThat(listSum.getSum()).isEqualTo(17);


    }

}