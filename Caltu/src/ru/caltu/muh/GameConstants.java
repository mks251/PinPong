package ru.caltu.muh;

/**
*���� ��������� �������� ��� ���������,������� ������������ � ����
*/
public interface GameConstants {
// ������� �����
public final int TABLE_WIDTH = 320;  
public final int TABLE_HEIGHT = 220;
public final int TABLE_TOP = 12;
public final int TABLE_BOTTOM = 180;
// ��� ����������� ���� � ��������!
public final int BALL_INCREMENT = 4;
// ������������ � ����������� ���������� ����
public final int BALL_MIN_X = 1+ BALL_INCREMENT;
public final int BALL_MIN_Y = 1 + BALL_INCREMENT;
public final int BALL_MAX_X = TABLE_WIDTH - BALL_INCREMENT;
public final int BALL_MAX_Y = TABLE_HEIGHT - BALL_INCREMENT;
// ��������� ���������� ����
public final int BALL_START_X = TABLE_WIDTH/2;
public final int BALL_START_Y = TABLE_HEIGHT/2;
//�������, ������������ � ��� ����������� �������
public final int KID_RACKET_X = 300;
public final int KID_RACKET_Y_START = 100;
public final int COMPUTER_RACKET_X = 15;
public final int COMPUTER_RACKET_Y_START = 100;
public final int RACKET_INCREMENT = 2;
public final int RACKET_LENGTH = 30;
public final int RACKET_WIDTH = 5;
public final int WINNING_SCORE = 21;
// ��������� ������� ���������� � �������� ��� ��������, 
// ���� �����������
public final int SLEEP_TIME = 10; //����� � �������������
}
/*!
����! �! ����������! ��������! ���������,! �������! ! ������! �! ������!
PingPongGameEngine:!!
!
"  ������!���������!MouseListener!�!���!���!������,!������!���!
��!������!��!������������!�����!����.!���!��������!����!
�����!��������������!MouseMotionListener.!
!
"  ������!����!�����!���������!���������!Runnable,!�!���!������!!
���������!�!������!run().!����������!��!�����������!�!���!�!
������! �! ��������! �����! �����.! �����! !run()! ������������!
�������! ����! �! ���������! �����,! ���! ���! ����!
�����������������! ������! �������! if(ballServed).! ���!
�����������!�������!���������!!if(ballServed==true).!
!
"  ����������,! ��������! ��������! ��! �������,! �������!
�������������!��������!����������!canBounce!�!������!����.!
�!�����������!��!�����!���������,!��������!����������!�����!
����!true,!����!false.!!
���������������� �� Java ��� �����, ���������, ������� � �������  211
!
"  �����! ���������! ���������! ! KeyListener,! �! �����!
keyPressed()! ���������,! �����! ������! ����! ������! ���!
������/����������! ����,! ����! ������! ����.! ����! �����!
���������!������������!���!���������,!���!�!���������!�����,!
��������!N!�!n.!
!
"  �! �������! ! ���������!private! �������:!displayScore(),!
kidServe()! �! isBallOnTheTable().! ���! ���������!
����������,! ������! ���! ������������! ������! ������! �����!
������! ! �! ������! ������! ����! ��! �����������! ��! ��!
�������������.!���!������!������������!�!��������.|!
!
"  ���������! ����������! ���������! �������,! ���!
��������������!��������! ����! ����������! ������.! �������! �!
��������! ����! �! �������! ������! Thread.sleep().!
�����������! �����!sleep()! ������������! �������! �����! ��!
��������!�!������������!����������!����*/