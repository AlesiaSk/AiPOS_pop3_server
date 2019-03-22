
package com.mycompany.aipos_pop3_server.Commands;

import com.mycompany.aipos_pop3_server.DataBase;
import com.mycompany.aipos_pop3_server.ServerHandler;
/**
 *
 * @author Алеся
 */
public class QUITCommand implements Command{

    public org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(QUITCommand.class);
    @Override
    public void execute() {
        ServerHandler.db.deleteAllFromDeletebox(ServerHandler.username);
                    String message = "+OK dewey POP3 server signing off";
                    ServerHandler.out.println(message);
                    log.info("S: '" + message);
    }
}
