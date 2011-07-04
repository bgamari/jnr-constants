// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Mon Dec 28 13:23:34 +0100 2009
package jnr.constants.platform.windows;
public enum Signal implements jnr.constants.Constant {
SIGTERM(15),
// SIGRTMIN not defined
// SIGTTIN not defined
// SIGPIPE not defined
SIGSEGV(11),
SIGABRT(22),
// SIGPROF not defined
// SIGTTOU not defined
// SIGTSTP not defined
// SIGSTOP not defined
// SIGCLD not defined
// SIGSTKFLT not defined
SIGFPE(8),
// SIGQUIT not defined
// SIGIO not defined
// SIGXCPU not defined
// SIGALRM not defined
// SIGUSR1 not defined
// SIGUSR2 not defined
SIGILL(4),
NSIG(23),
// SIGURG not defined
// SIGPWR not defined
// SIGKILL not defined
// SIGBUS not defined
// SIGUNUSED not defined
// SIGPOLL not defined
// SIGWINCH not defined
// SIGCONT not defined
// SIGCHLD not defined
// SIGRTMAX not defined
// SIGSYS not defined
// SIGXFSZ not defined
// SIGTRAP not defined
// SIGIOT not defined
// SIGHUP not defined
// SIGVTALRM not defined
SIGINT(2);
private final int value;
private Signal(int value) { this.value = value; }
public static final long MIN_VALUE = 2;
public static final long MAX_VALUE = 23;

public final int value() { return value; }
public final int intValue() { return value; }
public final long longValue() { return value; }
}
