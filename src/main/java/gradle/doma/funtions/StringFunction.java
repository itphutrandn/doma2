package gradle.doma.funtions;

import org.seasar.doma.expr.ExpressionFunctions;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class StringFunction  implements ExpressionFunctions {

    @Override
    public String escape(CharSequence text) {
        return null;
    }

    @Override
    public String escape(CharSequence text, char escapeChar) {
        return null;
    }

    @Override
    public String prefix(CharSequence prefix) {
        return null;
    }

    @Override
    public String prefix(CharSequence prefix, char escapeChar) {
        return null;
    }

    @Override
    public String suffix(CharSequence suffix) {
        return null;
    }

    @Override
    public String suffix(CharSequence suffix, char escapeChar) {
        return null;
    }

    @Override
    public String infix(CharSequence infix) {
        return null;
    }

    @Override
    public String infix(CharSequence infix, char escapeChar) {
        return null;
    }

    @Override
    public Date roundDownTimePart(Date date) {
        return null;
    }

    @Override
    public java.sql.Date roundDownTimePart(java.sql.Date date) {
        return null;
    }

    @Override
    public Timestamp roundDownTimePart(Timestamp timestamp) {
        return null;
    }

    @Override
    public LocalDateTime roundDownTimePart(LocalDateTime localDateTime) {
        return null;
    }

    @Override
    public Date roundUpTimePart(Date date) {
        return null;
    }

    @Override
    public java.sql.Date roundUpTimePart(java.sql.Date date) {
        return null;
    }

    @Override
    public Timestamp roundUpTimePart(Timestamp timestamp) {
        return null;
    }

    @Override
    public LocalDate roundUpTimePart(LocalDate localDate) {
        return null;
    }

    @Override
    public LocalDateTime roundUpTimePart(LocalDateTime localDateTime) {
        return null;
    }

    @Override
    public boolean isEmpty(CharSequence text) {
        return false;
    }

    @Override
    public boolean isNotEmpty(CharSequence text) {
        return false;
    }

    @Override
    public boolean isBlank(CharSequence text) {
        return false;
    }

    @Override
    public boolean isNotBlank(CharSequence text) {
        return false;
    }
}
