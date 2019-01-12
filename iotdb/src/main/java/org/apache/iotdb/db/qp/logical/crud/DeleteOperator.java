package org.apache.iotdb.db.qp.logical.crud;

import org.apache.iotdb.db.qp.logical.Operator;

/**
 * this class extends {@code RootOperator} and process delete statement
 */
public class DeleteOperator extends SFWOperator {

    private long time;

    public DeleteOperator(int tokenIntType) {
        super(tokenIntType);
        operatorType = Operator.OperatorType.DELETE;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public long getTime() {
        return time;
    }

}