// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2010-07-31 18:57:15 +1000
package jnr.constants.platform.fake;
public enum TCP implements jnr.constants.Constant {
TCP_MAX_SACK(1),
TCP_MSS(2),
TCP_MINMSS(3),
TCP_MINMSSOVERLOAD(4),
TCP_MAXWIN(5),
TCP_MAX_WINSHIFT(6),
TCP_MAXBURST(7),
TCP_MAXHLEN(8),
TCP_MAXOLEN(9),
TCP_NODELAY(10),
TCP_MAXSEG(11),
TCP_NOPUSH(12),
TCP_NOOPT(13),
TCP_KEEPALIVE(14),
TCP_NSTATES(15),
TCP_RETRANSHZ(16);
private final long value;
private TCP(long value) { this.value = value; }
public static final long MIN_VALUE = 1L;
public static final long MAX_VALUE = 16L;
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
}