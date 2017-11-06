package lv.javaguru.java3OnlineBanking.core.api;

public interface CommandExecutor {

    <T extends DomainCommandResult> T execute(DomainCommand<T> domainCommand);
}
