import { Component, OnInit } from '@angular/core';
import {User} from "../dto/user";
import {UserServiceService} from "../services/user-service.service";

@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.css']
})
export class UserListComponent implements OnInit {

  result : string = '';
  users: User[];

  constructor(private userService: UserServiceService) {
  }

  ngOnInit() {
    this.getUsers();
  }

  getUsers = () => {
    this.userService.findAll().subscribe(data => {
      this.users = data;
    });
  }

  calculate = () => {
    this.result = "aaa\nbbb";
  }
}
