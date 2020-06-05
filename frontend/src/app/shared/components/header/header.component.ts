import { Component, OnInit, EventEmitter, Output } from "@angular/core";

@Component({
  selector: "app-header",
  templateUrl: "./header.component.html",
  styleUrls: ["./header.component.scss"],
})
export class HeaderComponent implements OnInit {
  constructor() {}

  @Output() toggleSideBarForMe: EventEmitter<any> = new EventEmitter();

  ngOnInit() {}

  toggleSideBar(){
    this.toggleSideBarForMe.emit();
  }
}
