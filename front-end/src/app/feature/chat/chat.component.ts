import { Component, OnDestroy, OnInit } from '@angular/core';
import { WidthChangeService } from 'src/app/shared/services/width-change.service';

@Component({
  selector: 'app-chat',
  templateUrl: './chat.component.html',
  styleUrls: ['./chat.component.scss'],
})
export class ChatComponent implements OnInit, OnDestroy {
  toggle: boolean = false;
  messagesOptions = { opacity: 0, display: 'none' };
  chatCloseParams: any;
  closeChatToggle: boolean = false;
  openChatParams = { transform: 'translate(-350px, 0px)' };
  widthSubscription: any;

  constructor(private widthService: WidthChangeService) {}

  toggleAnimation(): void {
    this.toggle = !this.toggle;
  }

  closeChat(): void {
    this.closeChatToggle = !this.closeChatToggle;
    this.chatCloseParams = this.closeChatToggle
      ? { transform: 'translate(-350px, 0px)', visibility: 'hidden' }
      : { transform: 'translate(0px, 0px)' };

    this.toggle = !this.toggle;
    this.openChatParams = this.closeChatToggle
      ? { transform: 'translate(0px, 0px)' }
      : { transform: 'translate(-350px, 0px)' };

    this.widthService.changeWidth(true);
  }

  openChat(): void {
    this.closeChatToggle = !this.closeChatToggle;
    this.chatCloseParams = this.closeChatToggle
      ? { transform: 'translate(-350px, 0px)' }
      : { transform: 'translate(0px, 0px)' };

    this.openChatParams = this.closeChatToggle
      ? { transform: 'translate(0px, 0px)' }
      : { transform: 'translate(-350px, 0px)' };

    this.widthService.changeWidth(false);
  }

  ngOnInit(): void {
    this.widthSubscription = this.widthService.currentToggle.subscribe(
      (toggle) => {}
    );
  }

  ngOnDestroy(): void {
    this.widthSubscription?.unsubscribe();
  }
}
