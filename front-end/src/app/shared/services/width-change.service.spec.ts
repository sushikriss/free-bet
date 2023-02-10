import { TestBed } from '@angular/core/testing';

import { WidthChangeService } from './width-change.service';

describe('WidthChangeService', () => {
  let service: WidthChangeService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(WidthChangeService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
