package by.bsuir.task.controller.command;

import by.bsuir.task.constant.PageConstant;
import by.bsuir.task.controller.command.admin.AddRoomCommand;
import by.bsuir.task.controller.command.admin.DeoccupyRoomCommand;
import by.bsuir.task.controller.command.admin.ShowRoomsCommand;
import by.bsuir.task.controller.command.common.*;
import by.bsuir.task.controller.command.user.MainPageCommand;
import by.bsuir.task.controller.command.user.MakeOrderCommand;

public class CommandFactory {
    private static final CommandFactory INSTANCE = new CommandFactory();

    private CommandFactory() {
    }

    public static CommandFactory getInstance() {
        return INSTANCE;
    }

    public Command getCommand(String command) {
        switch (command) {
            case PageConstant.LOGIN:
                return new LoginCommand();
            case PageConstant.SHOW_ROOMS:
                return new ShowRoomsCommand();
            case PageConstant.MAIN_PAGE:
                return new MainPageCommand();
            case PageConstant.CHANGE_LANGUAGE:
                return new ChangeLanguageInterfaceCommand();
            case PageConstant.ADD_ROOM:
                return new AddRoomCommand();
            case PageConstant.MAKE_ORDER:
                return new MakeOrderCommand();
            case PageConstant.DEOCCUPY_ROOM:
                return new DeoccupyRoomCommand();
            case PageConstant.LOG_OUT:
                return new LogOutCommand();
            case PageConstant.START_PAGE:
                return new StartPageCommand();
            case PageConstant.SIGN_UP:
                return new SignUpCommand();
            case PageConstant.START_LOGIN:
                return new StartLoginCommand();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
