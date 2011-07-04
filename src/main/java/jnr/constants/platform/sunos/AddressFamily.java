// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Mon Feb 23 23:19:30 +0000 2009
package jnr.constants.platform.sunos;
public enum AddressFamily implements jnr.constants.Constant {
AF_UNSPEC(0),
// AF_LOCAL not defined
AF_UNIX(1),
AF_INET(2),
AF_IMPLINK(3),
AF_PUP(4),
AF_CHAOS(5),
AF_NS(6),
// AF_ISO not defined
AF_OSI(19),
AF_ECMA(8),
AF_DATAKIT(9),
AF_CCITT(10),
AF_SNA(11),
AF_DECnet(12),
AF_DLI(13),
AF_LAT(14),
AF_HYLINK(15),
AF_APPLETALK(16),
AF_ROUTE(24),
AF_LINK(25),
// pseudo_AF_XTP not defined
// AF_COIP not defined
// AF_CNT not defined
// pseudo_AF_RTIP not defined
AF_IPX(23),
// AF_SIP not defined
// pseudo_AF_PIP not defined
// AF_NDRV not defined
// AF_ISDN not defined
// AF_E164 not defined
// pseudo_AF_KEY not defined
AF_INET6(26),
// AF_NATM not defined
// AF_SYSTEM not defined
// AF_NETBIOS not defined
// AF_PPP not defined
// AF_ATM not defined
// pseudo_AF_HDRCMPLT not defined
// AF_NETGRAPH not defined
// AF_AX25 not defined
AF_MAX(30);
private final int value;
private AddressFamily(int value) { this.value = value; }
public static final long MIN_VALUE = 0;
public static final long MAX_VALUE = 30;

public final int value() { return value; }
public final int intValue() { return value; }
public final long longValue() { return value; }
}
