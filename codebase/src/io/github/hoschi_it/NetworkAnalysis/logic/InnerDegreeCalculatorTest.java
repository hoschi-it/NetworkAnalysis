package io.github.hoschi_it.NetworkAnalysis.logic;

import io.github.hoschi_it.NetworkAnalysis.data.AdjacenzMatrix;
import io.github.hoschi_it.NetworkAnalysis.data.Node;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InnerDegreeCalculatorTest
{
    private InnerDegreeCalculator _innerDegreeCalculator;

    private static AdjacenzMatrix getTestMatrix(){
        List<Integer[]> matrix = new ArrayList<>();
        matrix.add(new Integer[]{23, 23, 23});
        matrix.add(new Integer[]{23, 23, 23});
        matrix.add(new Integer[]{23, 0, 23});
        AdjacenzMatrix adjacenzMatrix = new AdjacenzMatrix(matrix);
        return adjacenzMatrix;
    }


    @BeforeEach
    void setUp()
    {
        _innerDegreeCalculator = new InnerDegreeCalculator(getTestMatrix());
    }

    @AfterEach
    void tearDown()
    {
        _innerDegreeCalculator = null;
    }

    @Test
    void testCalcAndCacheInnerDegree_singleNode()
    {
        Node node = new Node();
        node.setId(1);
        _innerDegreeCalculator.calcAndCacheInnerDegree(node);
        assertEquals(1, node.getInnerDegree());
    }

    @Test
    void testCalcAndCacheInnerDegree_singleNode1()
    {
        Node node = new Node();
        node.setId(2);
        _innerDegreeCalculator.calcAndCacheInnerDegree(node);
        assertEquals(2, node.getInnerDegree());
    }
}