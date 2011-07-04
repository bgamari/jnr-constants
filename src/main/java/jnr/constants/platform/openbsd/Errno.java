// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Wed Feb 25 18:33:04 +1000 2009
package jnr.constants.platform.openbsd;
public enum Errno implements jnr.constants.Constant {
EPERM(1),
ENOENT(2),
ESRCH(3),
EINTR(4),
EIO(5),
ENXIO(6),
E2BIG(7),
ENOEXEC(8),
EBADF(9),
ECHILD(10),
EDEADLK(11),
ENOMEM(12),
EACCES(13),
EFAULT(14),
ENOTBLK(15),
EBUSY(16),
EEXIST(17),
EXDEV(18),
ENODEV(19),
ENOTDIR(20),
EISDIR(21),
EINVAL(22),
ENFILE(23),
EMFILE(24),
ENOTTY(25),
ETXTBSY(26),
EFBIG(27),
ENOSPC(28),
ESPIPE(29),
EROFS(30),
EMLINK(31),
EPIPE(32),
EDOM(33),
ERANGE(34),
EWOULDBLOCK(35),
EAGAIN(35),
EINPROGRESS(36),
EALREADY(37),
ENOTSOCK(38),
EDESTADDRREQ(39),
EMSGSIZE(40),
EPROTOTYPE(41),
ENOPROTOOPT(42),
EPROTONOSUPPORT(43),
ESOCKTNOSUPPORT(44),
EOPNOTSUPP(45),
EPFNOSUPPORT(46),
EAFNOSUPPORT(47),
EADDRINUSE(48),
EADDRNOTAVAIL(49),
ENETDOWN(50),
ENETUNREACH(51),
ENETRESET(52),
ECONNABORTED(53),
ECONNRESET(54),
ENOBUFS(55),
EISCONN(56),
ENOTCONN(57),
ESHUTDOWN(58),
ETOOMANYREFS(59),
ETIMEDOUT(60),
ECONNREFUSED(61),
ELOOP(62),
ENAMETOOLONG(63),
EHOSTDOWN(64),
EHOSTUNREACH(65),
ENOTEMPTY(66),
EUSERS(68),
EDQUOT(69),
ESTALE(70),
EREMOTE(71),
ENOLCK(77),
ENOSYS(78),
EOVERFLOW(87),
EIDRM(89),
ENOMSG(90),
EILSEQ(84);
// EBADMSG not defined
// EMULTIHOP not defined
// ENODATA not defined
// ENOLINK not defined
// ENOSR not defined
// ENOSTR not defined
// EPROTO not defined
// ETIME not defined
private final int value;
private Errno(int value) { this.value = value; }
public static final long MIN_VALUE = 1;
public static final long MAX_VALUE = 90;

static final class StringTable {
  public static final java.util.Map<Errno, String> descriptions = generateTable();
  public static final java.util.Map<Errno, String> generateTable() {
    java.util.Map<Errno, String> map = new java.util.EnumMap<Errno, String>(Errno.class);
  map.put(EPERM, "Operation not permitted");
  map.put(ENOENT, "No such file or directory");
  map.put(ESRCH, "No such process");
  map.put(EINTR, "Interrupted system call");
  map.put(EIO, "Input/output error");
  map.put(ENXIO, "Device not configured");
  map.put(E2BIG, "Argument list too long");
  map.put(ENOEXEC, "Exec format error");
  map.put(EBADF, "Bad file descriptor");
  map.put(ECHILD, "No child processes");
  map.put(EDEADLK, "Resource deadlock avoided");
  map.put(ENOMEM, "Cannot allocate memory");
  map.put(EACCES, "Permission denied");
  map.put(EFAULT, "Bad address");
  map.put(ENOTBLK, "Block device required");
  map.put(EBUSY, "Device busy");
  map.put(EEXIST, "File exists");
  map.put(EXDEV, "Cross-device link");
  map.put(ENODEV, "Operation not supported by device");
  map.put(ENOTDIR, "Not a directory");
  map.put(EISDIR, "Is a directory");
  map.put(EINVAL, "Invalid argument");
  map.put(ENFILE, "Too many open files in system");
  map.put(EMFILE, "Too many open files");
  map.put(ENOTTY, "Inappropriate ioctl for device");
  map.put(ETXTBSY, "Text file busy");
  map.put(EFBIG, "File too large");
  map.put(ENOSPC, "No space left on device");
  map.put(ESPIPE, "Illegal seek");
  map.put(EROFS, "Read-only file system");
  map.put(EMLINK, "Too many links");
  map.put(EPIPE, "Broken pipe");
  map.put(EDOM, "Numerical argument out of domain");
  map.put(ERANGE, "Result too large");
  map.put(EWOULDBLOCK, "Resource temporarily unavailable");
  map.put(EAGAIN, "Resource temporarily unavailable");
  map.put(EINPROGRESS, "Operation now in progress");
  map.put(EALREADY, "Operation already in progress");
  map.put(ENOTSOCK, "Socket operation on non-socket");
  map.put(EDESTADDRREQ, "Destination address required");
  map.put(EMSGSIZE, "Message too long");
  map.put(EPROTOTYPE, "Protocol wrong type for socket");
  map.put(ENOPROTOOPT, "Protocol not available");
  map.put(EPROTONOSUPPORT, "Protocol not supported");
  map.put(ESOCKTNOSUPPORT, "Socket type not supported");
  map.put(EOPNOTSUPP, "Operation not supported");
  map.put(EPFNOSUPPORT, "Protocol family not supported");
  map.put(EAFNOSUPPORT, "Address family not supported by protocol family");
  map.put(EADDRINUSE, "Address already in use");
  map.put(EADDRNOTAVAIL, "Can't assign requested address");
  map.put(ENETDOWN, "Network is down");
  map.put(ENETUNREACH, "Network is unreachable");
  map.put(ENETRESET, "Network dropped connection on reset");
  map.put(ECONNABORTED, "Software caused connection abort");
  map.put(ECONNRESET, "Connection reset by peer");
  map.put(ENOBUFS, "No buffer space available");
  map.put(EISCONN, "Socket is already connected");
  map.put(ENOTCONN, "Socket is not connected");
  map.put(ESHUTDOWN, "Can't send after socket shutdown");
  map.put(ETOOMANYREFS, "Too many references: can't splice");
  map.put(ETIMEDOUT, "Connection timed out");
  map.put(ECONNREFUSED, "Connection refused");
  map.put(ELOOP, "Too many levels of symbolic links");
  map.put(ENAMETOOLONG, "File name too long");
  map.put(EHOSTDOWN, "Host is down");
  map.put(EHOSTUNREACH, "No route to host");
  map.put(ENOTEMPTY, "Directory not empty");
  map.put(EUSERS, "Too many users");
  map.put(EDQUOT, "Disc quota exceeded");
  map.put(ESTALE, "Stale NFS file handle");
  map.put(EREMOTE, "Too many levels of remote in path");
  map.put(ENOLCK, "No locks available");
  map.put(ENOSYS, "Function not implemented");
  map.put(EOVERFLOW, "Value too large to be stored in data type");
  map.put(EIDRM, "Identifier removed");
  map.put(ENOMSG, "No message of desired type");
  map.put(EILSEQ, "Illegal byte sequence");
    return map;
  }
}
public final String toString() { return StringTable.descriptions.get(this); }
public final int value() { return value; }
public final int intValue() { return value; }
public final long longValue() { return value; }
}
