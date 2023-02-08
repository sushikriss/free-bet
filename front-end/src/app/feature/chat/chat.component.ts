import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-chat',
  templateUrl: './chat.component.html',
  styleUrls: ['./chat.component.scss'],
})
export class ChatComponent implements OnInit {
  toggle: boolean = false;
  messagesOptions = { opacity: 0 };
  chatCloseParams = { transform: 'translate(0px, 0px)' };
  toggleChat: boolean = false;

  constructor() {}

  toggleAnimation(): void {
    this.toggle = !this.toggle;
    this.messagesOptions = this.toggle ? { opacity: 1 } : { opacity: 0 };
  }

  closeChat(): void {
    this.toggleChat = !this.toggleChat;
    this.chatCloseParams = this.toggleChat
      ? { transform: 'translate(0px, 0px)' }
      : { transform: 'translate(0px, 100px)' };
  }

  ngOnInit(): void {}
}
