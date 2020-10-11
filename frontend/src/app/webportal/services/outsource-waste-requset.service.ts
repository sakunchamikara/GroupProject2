import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';
import { ConfirmationDialogComponent } from 'src/app/modules/confirmation-dialog/confirmation-dialog.component';
import { AlertDialogComponent } from 'src/app/modules/alert-dialog/alert-dialog.component';

@Injectable({
  providedIn: 'root'
})
export class OutsourceWasteRequsetService {

   //private Url = 'http://localhost:8080/outsourceWasteRequests';

  constructor(private http:HttpClient,private modalService: NgbModal) { }

  createOutsourceWasteRequest(wasteRequest:Object):Observable<Object>{
    console.log("hello");

    console.log(wasteRequest);
    const baseUrl = 'http://localhost:8080/outRequest';
    return this.http.post<any>(baseUrl,wasteRequest);

  }
  getCustomerWasteRequestList():Observable<any>{
    console.log("asjh")
    const baseUrl = 'http://localhost:8080/outRequest';
    return this.http.get(baseUrl);
  }

  getCustomerWasteRequestListByStatus():Observable<any>{
   // console.log("asjh")
    const baseUrl = 'http://localhost:8080/getwasteStatus';
    return this.http.get(baseUrl);
  }

  getCustomerWasteRequestListConfirmed():Observable<any>{
    // console.log("asjh")
     const baseUrl = 'http://localhost:8080/getwasteStatusCon';
     return this.http.get(baseUrl);
   }

  getWasteListByEmail(email: String): Observable<any> {
    const uri = `http://localhost:8080/getwaste/${email}`;
    return this.http.get(uri);
  }
  getWasteListById(id: number): Observable<any> {
    const uri = `http://localhost:8080/getwasteid/${id}`;
    return this.http.get(uri);
  }
  deleteCustomerWasteRequest(id:number) :Observable<any>{
    const baseUrl = `http://localhost:8080/outRequest/${id}`;
    return this.http.delete(baseUrl, {responseType: 'text'});
  }
  public confirm(
    title: string,
    message: string,
    btnOkText: string = 'OK',
    btnCancelText: string = 'Cancel',
    dialogSize: 'sm'|'lg' = 'sm'): Promise<boolean> {
    const modalRef = this.modalService.open(ConfirmationDialogComponent, { size: dialogSize });
    modalRef.componentInstance.title = title;
    modalRef.componentInstance.message = message;
    modalRef.componentInstance.btnOkText = btnOkText;
    modalRef.componentInstance.btnCancelText = btnCancelText;

    return modalRef.result;

}
public alert(
  title: string,
  message: string,
  btnOkText: string = 'OK',
  dialogSize: 'sm'|'lg' = 'sm'): Promise<boolean> {
  const modalRef = this.modalService.open(AlertDialogComponent, { size: dialogSize });
  modalRef.componentInstance.title = title;
  modalRef.componentInstance.message = message;
  modalRef.componentInstance.btnOkText = btnOkText;

  return modalRef.result;

}

public alertupdate(
  title: string,
  message: string,
  btnOkText: string = 'OK',
  dialogSize: 'sm'|'lg' = 'sm'): Promise<boolean> {
  const modalRef = this.modalService.open(AlertDialogComponent, { size: dialogSize });
  modalRef.componentInstance.title = title;
  modalRef.componentInstance.message = message;
  modalRef.componentInstance.btnOkText = btnOkText;

  return modalRef.result;

}


update(id: number, value: any): Observable<Object> {
  const baseUrl = `http://localhost:8080/upoutwaste/${id}`;
  return this.http.put(baseUrl, value);
}

getCountPendingWasteRequests(): Observable<any> {
  let url = `http://localhost:8080/outWasteRequests/status`;
  return this.http.get(url)
}

}
