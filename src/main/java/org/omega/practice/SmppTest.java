package org.omega.practice;

import org.jsmpp.DefaultPDUSender;
import org.jsmpp.bean.BindType;
import org.jsmpp.bean.NumberingPlanIndicator;
import org.jsmpp.bean.TypeOfNumber;
import org.jsmpp.extra.SessionState;
import org.jsmpp.session.*;

import java.io.IOException;

/**
 * Created by Quatra on 1/2/2019.
 */
public class SmppTest implements SessionStateListener {



    SmppTest() {

        BindParameter bp = new BindParameter(BindType.BIND_TRX, "smppclient1", "password",
                null, null, null, null);


        try {
            SMPPSessionContext sessionContext = new SMPPSessionContext(
                    new SMPPSession("127.0.0.1", 2775, bp), this
            );

//            sessionContext.getStateProcessor().

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String s[]) {
        new SmppTest();
    }

    @Override
    public void onStateChange(SessionState sessionState, SessionState sessionState1, Session session) {




    }
}
