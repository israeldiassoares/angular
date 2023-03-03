/* tslint:disable:no-unused-variable */
import { async, ComponentFixture, TestBed } from '@angular/core/testing'
import { By } from '@angular/platform-browser'
import { DebugElement } from '@angular/core'

import { ConfirmationDialogComponent } from './confirmation-dialog.component'
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog'

describe('ConfirmationDialogComponent', () => {
  let component: ConfirmationDialogComponent
  let fixture: ComponentFixture<ConfirmationDialogComponent>

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ConfirmationDialogComponent ],
      providers: [
        { provide: MatDialogRef, useValue: {} },
        { provide: MAT_DIALOG_DATA, useValue: {} },

      ]
    })
      .compileComponents()
  }))

  beforeEach(() => {
    fixture = TestBed.createComponent(ConfirmationDialogComponent)
    component = fixture.componentInstance
    fixture.detectChanges()
  })

  it('should create', () => {
    expect(component).toBeTruthy()
  })
})
