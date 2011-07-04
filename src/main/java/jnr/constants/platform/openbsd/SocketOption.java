// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Wed Feb 25 18:33:22 +1000 2009
package jnr.constants.platform.openbsd;
public enum SocketOption implements jnr.constants.Constant {
SO_DEBUG(0x1),
SO_ACCEPTCONN(0x2),
SO_REUSEADDR(0x4),
SO_KEEPALIVE(0x8),
SO_DONTROUTE(0x10),
SO_BROADCAST(0x20),
SO_USELOOPBACK(0x40),
SO_LINGER(0x80),
SO_OOBINLINE(0x100),
SO_REUSEPORT(0x200),
// SO_TIMESTAMP not defined
// SO_ACCEPTFILTER not defined
// SO_DONTTRUNC not defined
// SO_WANTMORE not defined
// SO_WANTOOBFLAG not defined
SO_SNDBUF(0x1001),
SO_RCVBUF(0x1002),
SO_SNDLOWAT(0x1003),
SO_RCVLOWAT(0x1004),
SO_SNDTIMEO(0x1005),
SO_RCVTIMEO(0x1006),
SO_ERROR(0x1007),
SO_TYPE(0x1008);
// SO_NREAD not defined
// SO_NKE not defined
// SO_NOSIGPIPE not defined
// SO_NOADDRERR not defined
// SO_NWRITE not defined
// SO_REUSESHAREUID not defined
// SO_LABEL not defined
// SO_PEERLABEL not defined
// SO_ATTACH_FILTER not defined
// SO_BINDTODEVICE not defined
// SO_DETACH_FILTER not defined
// SO_NO_CHECK not defined
// SO_PASSCRED not defined
// SO_PEERCRED not defined
// SO_PEERNAME not defined
// SO_PRIORITY not defined
// SO_SECURITY_AUTHENTICATION not defined
// SO_SECURITY_ENCRYPTION_NETWORK not defined
// SO_SECURITY_ENCRYPTION_TRANSPORT not defined
private final int value;
private SocketOption(int value) { this.value = value; }
public static final long MIN_VALUE = 0x1;
public static final long MAX_VALUE = 0x1008;

public final int value() { return value; }
public final int intValue() { return value; }
public final long longValue() { return value; }
}
