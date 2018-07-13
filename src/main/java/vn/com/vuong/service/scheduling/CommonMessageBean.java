package vn.com.vuong.service.scheduling;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

//Hàm dùng lập lịch, không tham số, không trả về
@Component("commonMessageBean")
public class CommonMessageBean {

	@Scheduled(fixedDelay = 5000)
	public void broadcastNotification() {
		System.out.println("CommonMessage Broadcast Notification: " + Thread.currentThread().getName());
	}

	@Scheduled(fixedRate = 5000)
	public void receivedNotification() {
		System.out.println("Received Notification: " + Thread.currentThread().getName());
	}

	@Scheduled(cron="*/5 * * * * MON-FRI")
	public void showResult() {
		System.out.println("Show Result: " + Thread.currentThread().getName());
	}
}
