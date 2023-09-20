import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProfailGroupsComponent } from './profail-groups.component';

describe('ProfailGroupsComponent', () => {
  let component: ProfailGroupsComponent;
  let fixture: ComponentFixture<ProfailGroupsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ProfailGroupsComponent]
    });
    fixture = TestBed.createComponent(ProfailGroupsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
